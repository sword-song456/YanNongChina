package com.wuchengdong.controller;

import com.wuchengdong.pojo.Shangpin;
import com.wuchengdong.service.Impl.ShangpinServiceImpl;
import com.wuchengdong.service.ShangpinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shangpin")
public class shangpinController {
    @Autowired
    ShangpinService shangpinService;

    @GetMapping
    List<Shangpin> getShangpin(){
        return shangpinService.getShangpin(ShangpinServiceImpl.GET_ALL);
    }

    @GetMapping("/random")
    List<Shangpin> getShangpinRandom(){
        return shangpinService.getShangpin(ShangpinServiceImpl.RANDOM);
    }

    @PostMapping
    int setShangpin(@RequestBody Shangpin shangpin){
        return shangpinService.setShangpin(shangpin);
    }

    @PutMapping
    int updateShangpin(@RequestBody Shangpin shangpin){
        return shangpinService.updateShangpin(shangpin);
    }

    @DeleteMapping("/{id}")
    int deleteShangpin(@PathVariable("id") int id){
        return shangpinService.deleteShangpin(id);
    }
}
