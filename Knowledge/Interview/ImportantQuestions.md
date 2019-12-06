#Important Questions
Diamond Problem[that is why multiple inheritence is not allowed]
    If we are inherintg 2 classes that hava same method, then
    it will not know which method to call.
    [we may also apply override into the derived class, 
    but for the classes the compiler wont tell u to compusorily override it]
    
    [In java 8]
    But we can implement multiple interfaces[first it will give compile error:duplicate default method] and to avoid diamond problem, we have to override the declared method.
    Note: we can only do it for the default method as for static methods will be derived in the first place

#Concurrent Collection Exception
Ans: while using for each we cannot modify the collection[Exception       will come]
    while using iterator we can iterate and modify the collection.

#static and default methods 
static: belong to the interface and will not be derived.
default: these methods will be derived to the.derive class to provide additional functionality to the class.

#Concurrency
Earlier java was not multi-core-processor
to make java programs to run on multicore-processor.

#Stream APIs: 
it only does the processing and does not hold the data.

#static methods in class can be derived but the static methods of the inteface[Java 8] cannot be derived.
Tipt to remember: class can be instantiated and intefaces cannot be instatntiated[static methods of the interface belong completely to the interface]

#Callable Interface
In jdbc, if we want to use a stored procedure from the backend.
we use CallableStatement(by using Callable interface).

#Are servlets thread safe?
No, Because service method present in the servlets can be accessed by any thread.
To make them thread safe, implement SingleThreadModel.

#why cant we make objects of PrintStream?
because they are native methods and belong to native api of java.
Native API: it connects the java code running on jvm to the underlying 
system or assembly language.
