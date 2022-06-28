# learn-git
A dummy git repository to learn the features of git

I hope I can learn git very well after this.

this is a new change

yet another change

docker run -it --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3.10-management

new changes after hard reset

@GetMapping("weekly/{project_id}")
    public ResponseEntity<Long> getCountWithProjectId(@PathVariable("project_id") Integer projectId) {
        return new ResponseEntity<>(deploymentFrequencyService.getWeeklyDeployments(projectId).stream().count(), HttpStatus.OK);
    }

    
    @GetMapping("count/{project_id}")
    public ResponseEntity<Long> getCountWithProjectId(@PathVariable("project_id") Integer projectId) {
        return new ResponseEntity<>(deploymentService.getDeploymentsOfProjectId(projectId).stream().count(), HttpStatus.OK);
    }

{
  "object_kind": "tag_push",
  "event_name": "tag_push",
  "before": "0000000000000000000000000000000000000000",
  "after": "82b3d5ae55f7080f1e6022629cdb57bfae7cccc7",
  "ref": "refs/tags/v1.0.0",
  "checkout_sha": "82b3d5ae55f7080f1e6022629cdb57bfae7cccc7",
  "user_id": 1,
  "user_name": "John Smith",
  "user_avatar": "https://s.gravatar.com/avatar/d4c74594d841139328695756648b6bd6?s=8://s.gravatar.com/avatar/d4c74594d841139328695756648b6bd6?s=80",
  "project_id": 1,
  "project":{
    "id": 1,
    "name":"Example",
    "description":"",
    "web_url":"http://example.com/jsmith/example",
    "avatar_url":null,
    "git_ssh_url":"git@example.com:jsmith/example.git",
    "git_http_url":"http://example.com/jsmith/example.git",
    "namespace":"Jsmith",
    "visibility_level":0,
    "path_with_namespace":"jsmith/example",
    "default_branch":"master",
    "homepage":"http://example.com/jsmith/example",
    "url":"git@example.com:jsmith/example.git",
    "ssh_url":"git@example.com:jsmith/example.git",
    "http_url":"http://example.com/jsmith/example.git"
  },
  "repository":{
    "name": "Example",
    "url": "ssh://git@example.com/jsmith/example.git",
    "description": "",
    "homepage": "http://example.com/jsmith/example",
    "git_http_url":"http://example.com/jsmith/example.git",
    "git_ssh_url":"git@example.com:jsmith/example.git",
    "visibility_level":0
  },
  "commits": [],
  "total_commits_count": 0
}

{
  "event_name": "tag_push",
  "ref": "refs/tags/tag-event-6",
  "tag_created_time":"2022-06-22T18:53:09.308264600",
  "project_id" : 21601,
  "commits": [
    {
      "id": "abcd",
      "commit_time_stamp": "2022-06-19T10:00:40+00:00"
    },
    {
      "id": "efgh",
      "commit_time_stamp": "2023-06-19T10:00:40+00:00"
    }
  ]
}


build the context well before explaining architecture, tech stack etc.

reduce text, come in and talk

discuss the reason behind the choice of the tech stack

bring up points like TDD is a part of Xtreme programming

Try to speak about the fundamentals of why we are using the tools and technologies we are using

Include/Share your experience of how you learnt and build such a application. We didn't know most of the tech stack, and not knowing jargons, and not knowing the standard industry practices used while coding.


Points to Note for tomorrow's(26-06-2022) Internal Demo

Tech Stack
List all techs - Lombok, Jackson, ModelMapper, Spring, JPA, Hibernate, Postgres, MonogDB - why nosql in s1 and sql in s2
Why and how the techs were used, why RabbitMQ instead of Kofka(don't need to be in detail about kofka) - give one liner explaination.

Have been using 12 factor methodology (each part should have seperate repo, manage dependency, configs should be in seperate files, all services should be loosely coupled(so we can change the componenets when needed at a later point in time easily))

Following Xtreme Programming - weekly targets, TDD(benifits)

SOLID(is a acronym) principles to write clean code

PPT - Intro(photos of members), Agenda(Brief Structure of the PPT), problem statement(what and why we are solving, build the context - Talha and Me), arch diagram( - Bhoomika, Anjali and Divyanshu explain respective parts), demo(explain deploy_freq, start with UI, then explain backend - Talha shows UI and Amar takes over if backend demo is required), Tech Stack and Learnings(Shashi and Shri), Methodology(Neha and Rahul), In the coming weeks we are planning to deploy this on the cloud, Containization, git lab runner, ;
-- Core Values(no need slide for now, briefly cover it whenever we are speaking)

Adress them as parts and not group/sub-group


so we are supposed to do the following

Into(Team Members and all)
 - Good Morning Everyone. We are from the GS team. Here is our team of 10 passionate interns. We have worked on our project called Dorametrics.
Agenda
 - So in our presentation today the agenda is going to be as follows
Explain DevOps
Build story about why we need DevOps 
 - like a conversation
Explain Our approach briefly, the way we use DORA's 4 key metrics



Circ

Prometheus

Kubernetes

How to create a Docker file and run it




27-06-2022 - evening meet


Task 1 - Neha, Talha, Shashi, Anjali
CI/CD setup
  Gitlab Runner setup
  Gitlab yaml file creation
  Runner should trigger the pipeline for the code commit
  sonar qube

Task 2 - Amar, Divyanshu, Rahul
Containerize the jar using Docker File
Orchestrate the containerization using K8s
Argo CD deployment
Helm chart

Task 3 - Bhoomika, Prajwal, Shri
Logs Tracing
  Zipkin & Sleuth
Promethus -  Monitoring using Grafana dashboard
Cloud config
Circuit breaker