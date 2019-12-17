##  InterThread Communication

    Process in which a thread is paused running in its critical region and another thread is allowed to enter (or lock) in the same critical region to be executed.

### Methods used in interThread Communication
1. **wait():** this method instructs the current thread to release the *monitor* held by it and to get suspended until some other threads sends a notification from the same monitor.

>Syntax: public void wait() throws InterruptedException. 

2. **notify():** this method is used to send the notification to the thread that is suspended by the wait() method.

 >   Syntax: public void notify().

3. **notifyAll():** this method is used to send the notification to all the threads that are suspended by wait() method.

  >  Syntax: public void notifyAll().

  ### Overriding start method

     We can override the start method in thread. But when we class thread.start() method then overrided method will be called which results into no execution of run method. Hence no job will be performed.

    So, we do not have to override the start method.

>Note: We can call super class start method in overrided start method to invoke run method.

##  References
- [Multithreading and Concurrency in detail](http://tutorials.jenkov.com/java-concurrency/same-threading.html)
- [Multithreading coding in short](https://codesjava.com/which-is-a-better-way-to-create-a-thread-in-java)