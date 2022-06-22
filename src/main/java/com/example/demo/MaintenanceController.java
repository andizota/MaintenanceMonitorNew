package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class MaintenanceController {

    MonitorService msgreceived = new MonitorService("-");


    //Method to get data
    @GetMapping("/api/maintenanceMode")
    public String GetMonitorData()
    {
        return msgreceived.getMsg();
    }


    //Method to set a message => Change monitor
    @PostMapping("/api/maintenanceMode")
    public void SetMessage(@RequestParam String msg)
    {
        msgreceived.setMsg(msg);
    }

}