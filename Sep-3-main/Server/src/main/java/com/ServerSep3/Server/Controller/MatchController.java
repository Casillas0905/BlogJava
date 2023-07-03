package com.ServerSep3.Server.Controller;

import com.ServerSep3.Server.Model.MatchModel;
import com.ServerSep3.Server.Service.MatchService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/match")
public class MatchController {
    private final MatchService matchService;

    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }

    @GetMapping("/{id}")
    public MatchModel findById(@PathVariable("id")int id){
        return matchService.findById(id);
    }

    @PostMapping("/update")
    public MatchModel updateMatch(@RequestBody MatchModel matchModel){
        return matchService.updateMatch(matchModel);
    }

    @PostMapping("/save")
    public MatchModel saveMatch(@RequestBody MatchModel matchModel){
        return matchService.createMatch(matchModel);
    }

    @GetMapping("/delete/{id}")
    public void deleteMatch(@PathVariable("id")long id){matchService.deleteMatch(id);}

}
