package com.kgc.zhang.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kgc.zhang.entity.Standard;
import com.kgc.zhang.entity.StandardExample;
import com.kgc.zhang.service.StandardService;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang.math.RandomUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class StandardController  {
    @Resource
    StandardService standardService;
    @RequestMapping("index")
    public  String doindex(Model model,String pageNumStr,String name){
        StandardExample example=new StandardExample();
        StandardExample.Criteria criteria = example.createCriteria();
        Integer pageNum=1;//第几页

        if (name!=null&&name.isEmpty()==false){
            criteria.andZhnameLike("%"+name+"%");
        }
     /*   StandardExample.Criteria criteria2 = example.createCriteria();
        if (name!=null&&name.isEmpty()==false){
            criteria2.andStdNumLike("%"+name+"%");
            example.or(criteria2);
        }*/

        if(pageNumStr!=null){
            pageNum=Integer.parseInt(pageNumStr);
        }
        Integer pageSize=3;//每页的数量
        PageHelper.startPage(pageNum,pageSize);
        PageHelper.orderBy("id asc");
        List<Standard> standardss = standardService.selectByExample(example);
        PageInfo<Standard> list = new PageInfo<>(standardss);
        model.addAttribute("pageInfo",list);
        model.addAttribute("name",name);
        return "index";
    }
    @RequestMapping("doadd")
    public  String doadd(Standard standard, MultipartFile file, HttpServletRequest request){
        //获取原文件名
        String originalFilename = file.getOriginalFilename();
        System.out.println("原图片名称"+originalFilename);
        /*获取上传路劲*/
        String realPath = request.getSession().getServletContext().getRealPath("/static/img");
        //获取扩展名
        String extension = FilenameUtils.getExtension(originalFilename);
        System.out.println("原图片拓展名"+extension);
        //生成新文件名
        String fileName=System.currentTimeMillis()+ (RandomUtils.nextInt(10000000)+"_Personal.")+extension;
        System.out.println("新文件名"+fileName);
        /*封装file对象*/
        File files=new File(realPath,fileName);
        /*上传*/
        try {
            file.transferTo(files);
            standard.setPackagePath(fileName);
            int insert = standardService.insert(standard);
            if (insert>0){
                return "redirect:index";
            }else {
                return "redirect:index";
            }
        } catch (IOException e) {
            e.printStackTrace();
            return "redirect:index";
        }
    }
    @RequestMapping("doname")
    @ResponseBody
    public  Map  doname(String stdNum){
        StandardExample example=new StandardExample();
        StandardExample.Criteria criteria = example.createCriteria();
        criteria.andStdNumEqualTo(stdNum);
        List<Standard> standardss = standardService.selectByExample(example);
        Map map=new HashMap();
        if (standardss.get(0).getStdNum().equals(stdNum)){
            map.put("status","true");
        }else {
            map.put("status","false");
        }

        return map;
    }
    @RequestMapping("updatecha")
    public  String updatecha(Model model,Integer id){
        Standard standard = standardService.selectByPrimaryKey(id);
        model.addAttribute("list",standard);
        return "update";
    }
    @RequestMapping("delete")
    public  String delete(Model model,String str){
        ArrayList list=new ArrayList();
        String []idd=str.split(",");
        for(int i=0;i<idd.length;i++) {
            int num=Integer.parseInt(idd[i]);
            list.add(num);
        }
            int delete = standardService.delete( list);
            if (delete>0){
                return "redirect:index";
            }else {
                return "redirect:index";
            }
    }
    @RequestMapping("doupdate")
    public  String doupdate(Standard standard, MultipartFile file, HttpServletRequest request){
        //获取原文件名
        String originalFilename = file.getOriginalFilename();
        System.out.println("原图片名称"+originalFilename);
        /*获取上传路劲*/
        String realPath = request.getSession().getServletContext().getRealPath("/static/img");
        //获取扩展名
        String extension = FilenameUtils.getExtension(originalFilename);
        System.out.println("原图片拓展名"+extension);
        //生成新文件名
        String fileName=System.currentTimeMillis()+ (RandomUtils.nextInt(10000000)+"_Personal.")+extension;
        System.out.println("新文件名"+fileName);
        /*封装file对象*/
        File files=new File(realPath,fileName);
        /*上传*/
        try {
            file.transferTo(files);
            if (file!=null&&file.isEmpty()==false){
                standard.setPackagePath(fileName);
            }

            int insert = standardService.updateByPrimaryKeySelective(standard);
            if (insert>0){
                return "redirect:index";
            }else {
                return "redirect:index";
            }
        } catch (IOException e) {
            e.printStackTrace();
            return "redirect:index";
        }

    }

    @RequestMapping("download")
    @ResponseBody
    public  void  down(String fileName, HttpServletRequest request, HttpServletResponse response){
        String realPath = request.getSession().getServletContext().getRealPath("static/img");
        File file=new File(realPath,fileName);
        //设置响应类型  ==》 告诉浏览器当前是下载操作，我要下载东西
        response.setContentType("application/x-msdownload");
        //设置下载时文件的显示类型(即文件名称-后缀)   ex：txt为文本类型
        response.setHeader("Content-Disposition", "attachment;filename=" + fileName);
        //下载文件：将一个路径下的文件数据转到一个输出流中，也就是把服务器文件通过流写(复制)到浏览器端
        try {
            Files.copy(file.toPath(), response.getOutputStream());//Files.copy(要下载的文件的路径,响应的输出流)
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
