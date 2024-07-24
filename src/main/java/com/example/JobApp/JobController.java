package com.example.JobApp;

import com.example.JobApp.JobService.JobService;
import com.example.JobApp.model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@Controller
public class JobController {
    @Autowired
    private JobService service;

   @GetMapping({"/", "home"})
    public String home(){
        return "home";
    }

    @GetMapping("addjob")
    public String addJob(){
        return "addjob";
    }
    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost){
        service.addJobPost(jobPost);
        return "success";
    }
    @GetMapping("viewalljobs")
    public String viewJobs(Model m){
        List<JobPost> jobs = service.returnAllJobPosts();
        m.addAttribute("jobPosts");
        return "viewalljobs";
    }
}
