#Important
ApplicationContext: supports internationalisation
BeanFactory
Performs pre-loading of singleton beans

Spring is unobtrusive: does not disturb the existing code
performs lazy loading

#when to consider constructor and when to setter injection?
Constructor is called at starting, so when we need to instantiate bean, constructor is preffered.
If both used, then setter will override the constructor.


