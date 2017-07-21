package com.example.ui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RefreshScope
@Controller
public class GreetingController {

    @Autowired
    private DiscoveryClient discoveryClient;
	
	@Value("${message:Hello default}")
    private String message;
    
	private String url;
	
    @RequestMapping("/greeting")
    public String greeting(Model model) {
    	
    	List<ServiceInstance> list = this.discoveryClient.getInstances("travel-gateway");
        if (list != null && list.size() > 0 ) {
        	url = "https://" + list.get(0).getUri().getHost() + "/travel-client/destinations";
        } else {
        	url = "/travel-client/destinations";
        }
        model.addAttribute("url", url);
        model.addAttribute("message", message);
        return "greeting";
    }

}