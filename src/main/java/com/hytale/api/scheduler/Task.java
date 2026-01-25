package com.hytale.api.scheduler;

public interface Task {
    int getTaskId();
    boolean isCancelled();
    void cancel();
}
