# Factory Method Pattern

* A Factory Pattern or Factory Method Pattern says that **just define an interface or abstract class for creating an object but let the subclasses decide which class to instantiate.** In other words, subclasses are responsible to create the instance of the class.

### Specification of OS: A Real World Example of Factory Method
- Step 1: Create a "OS" interface or abstract class. i.e. [[OS.java](https://github.com/Rohit-MyRG/Java-Design-Patterns/blob/main/Factory%20Method%20Pattern/mypack/OS.java)]:
  - The interface here is helps to create an reference of of Sub Classes:
```java
    interface OS{
        public abstract void spec(); //Must implement this method in subclasses of OS interface.
    }
```
- Step 2: Create the concrete classes that extends **OS interface**. i.e. [[Android.java](https://github.com/Rohit-MyRG/Java-Design-Patterns/blob/main/Factory%20Method%20Pattern/mypack/Android.java), [IOS.java](https://github.com/Rohit-MyRG/Java-Design-Patterns/blob/main/Factory%20Method%20Pattern/mypack/IOS.java), [Windows.java](https://github.com/Rohit-MyRG/Java-Design-Patterns/blob/main/Factory%20Method%20Pattern/mypack/Windows.java)]
  - These all classes are hidden from client side and provide functionalities. i.e.
```java
class Android implements OS{
      public void spec(){ /* your code */ }
}
class IOS implements OS{
      public void spec(){ /* your code */ }
}
class Windows implements OS{
      public void spec(){ /* your code */}
}
```

- Step 3: Create a OperatingSystemFactory class to generate object of concrete classes based on given information. i.e. [[OperatingSystemFactory.java](https://github.com/Rohit-MyRG/Java-Design-Patterns/blob/main/Factory%20Method%20Pattern/mypack/OperatingSystemFactory.java)]
  - This OperatingSystemFactory class is a collection of instances/objects. like you can see the following functions.
```java
public class OperatingSystemFactory{
    public OS getInstance(String str){ /* returns the instance of type OS */ }
}
```
   This getInstance Method return the instance of concrete classes. and this is a **factory of instances**, so thats why we called this design is the **Factory method pattern design"**. for more understanding see the following UML diagram.

### UML for Factory Method Pattern

![image](https://user-images.githubusercontent.com/49193132/133135931-45aa6187-1977-4306-a313-3a369dbf84d8.png)
