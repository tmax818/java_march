# Interfaces
--
You can think of an interface as a list of specifications that a class agrees to follow.
--

```java
public interface DojoRepository extends CrudRepository<Dojo, Long> {
    List<Dojo> findAll();
}
```