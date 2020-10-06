package com.kgc.zhang.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kgc.zhang.entity.Projectinfo;
import com.kgc.zhang.entity.ProjectinfoExample;
import com.kgc.zhang.service.ProjectinfoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class ProjectinfoController {
    @Resource
    ProjectinfoService projectinfoService;
    @RequestMapping("index")
    public  String doindex(Model model,Integer status,String pageNumStr){
        Integer pageNum=1;//第几页
        if(pageNumStr!=null){
            pageNum=Integer.parseInt(pageNumStr);
        }
        Integer pageSize=5;//每页的数量
        PageHelper.startPage(pageNum,pageSize);
        PageHelper.orderBy("id asc");
        ProjectinfoExample example =new ProjectinfoExample();
        ProjectinfoExample.Criteria criteria = example.createCriteria();
       if (status!=null&&status!=0) {
           criteria.andStatusEqualTo(status);
       }


//排序

        List<Projectinfo> projectinfos = projectinfoService.selectByExample(example);
        PageInfo<Projectinfo> list = new PageInfo<>(projectinfos);
        model.addAttribute("projectinfoPageInfo",list);
        return "index";

    }
    @RequestMapping("updatecha")
    public  String updatecha(Model model,Integer id){
        Projectinfo projectinfo = projectinfoService.selectByPrimaryKey(id);
        model.addAttribute("list",projectinfo);
        return "update";
    }
    @RequestMapping("update")
    public  String doupdate(Projectinfo projectinfo,Model model,Integer status,String pageNumStr){
        int i = projectinfoService.updateByPrimaryKeySelective(projectinfo);
        if (i>0){
            Integer pageNum=1;//第几页
            if(pageNumStr!=null){
                pageNum=Integer.parseInt(pageNumStr);
            }
            Integer pageSize=5;//每页的数量
            PageHelper.startPage(pageNum,pageSize);
            PageHelper.orderBy("id asc");
            ProjectinfoExample example =new ProjectinfoExample();
            ProjectinfoExample.Criteria criteria = example.createCriteria();
            if (status!=null&&status!=0) {
                criteria.andStatusEqualTo(status);
            }


//排序

            List<Projectinfo> projectinfos = projectinfoService.selectByExample(example);
            PageInfo<Projectinfo> list = new PageInfo<>(projectinfos);
            model.addAttribute("projectinfoPageInfo",list);

            model.addAttribute("flag","审核成功！");
                  return "index";
        }else {
            return "redirect:index";
        }

    }
}
