# Tesla

Think of classes as factories or [Tesla](https://en.wikipedia.org/wiki/Tesla,_Inc.) the company.

```java
class Tesla {

}
```

![](../../../images/tesla-gigafactory-4-europe.jpg)

There are facts about my individual [tesla](Tesla.java):

```java

class Tesla {
    //fields
    String color;
    int doors;
    int milage;
    int charge;
}

```

There are things my tesla can do:

```java

class Tesla {
    // fields
    String color;
    int doors;
    int milage;
    int charge;

    // methods
    public void drive(){
        System.out.println("silence");
    }
}