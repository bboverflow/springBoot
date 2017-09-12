package cn.trusteye.springboot.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;


    @RequestMapping(value = "/say", method = RequestMethod.GET)
//    public String say(@PathVariable("id") Integer id) {
    public String say(@RequestParam(value = "id",required = false,defaultValue = "0") Integer myid) {
        return "id : " + myid;
//        return girlProperties.getCupSize();
    }
}
