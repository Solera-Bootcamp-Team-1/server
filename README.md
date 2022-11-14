# server
Our RESTful API

## How does this work
There are two files (teams.json and tasks.json) on the root directory.
Two data classes (POJOs) `package com.solera.team1.server.{Team,TeamTask}` are used to serialize and deserialize their contents.

## API documentation
- `/api/tasks` returns an array of all the tasks.
- `/api/teams` returns an array of all the teams.
