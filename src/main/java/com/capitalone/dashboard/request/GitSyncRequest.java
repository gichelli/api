package com.capitalone.dashboard.request;

import javax.validation.constraints.NotNull;

public class GitSyncRequest {
    @NotNull
    private String repo;
    @NotNull
    private String branch;
    @NotNull
    private long startTime;

    public String getRepo() {
        return repo;
    }

    public void setRepo(String repo) {
        this.repo = repo;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

}
