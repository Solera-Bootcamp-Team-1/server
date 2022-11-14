package com.solera.team1.server.api;

import com.solera.team1.server.Team;
import com.solera.team1.server.TeamTask;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeamDataController {

    @GetMapping("/teams")
    public List<Team> teams(String name) {
        return Team.deserializeTeams();
    }

    @GetMapping("/tasks")
    public List<TeamTask> tasks(String name) {
        return TeamTask.deserializeTasks();
    }
}
