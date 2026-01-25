package com.hytale.api.scheduler;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;

import java.util.concurrent.TimeUnit;

public interface Scheduler {
    Task runTask(Runnable task);
    Task runTaskLater(Runnable task, long delay, TimeUnit unit);
    Task runTaskTimer(Runnable task, long initialDelay, long period, TimeUnit unit);
    Task runTaskAsync(Runnable task);
    
    <T> CompletableFuture<T> callSync(Callable<T> task);
}
