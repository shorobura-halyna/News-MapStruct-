# MapStruct
Set up:
- For Maven based projects add the following to your POM file in order to use MapStruct:

<properties>
    <org.mapstruct.version>1.3.1.Final</org.mapstruct.version>
</properties>
...
<dependencies>
    <dependency>
        <groupId>org.mapstruct</groupId>
        <artifactId>mapstruct</artifactId>
        <version>${org.mapstruct.version}</version>
    </dependency>
</dependencies>
...
<build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-compiler-plugin</artifactId>
            <version>3.5.1</version>
            <configuration>
                <source>1.8</source>
                <target>1.8</target>
                <annotationProcessorPaths>
                    <path>
                        <groupId>org.mapstruct</groupId>
                        <artifactId>mapstruct-processor</artifactId>
                        <version>${org.mapstruct.version}</version>
                    </path>
                </annotationProcessorPaths>
            </configuration>
        </plugin>
    </plugins>
</build>
###

public class Car {
 
    private String make;
    private int numberOfSeats;
    private CarType type;
 
    //constructor, getters, setters etc.
}

public class CarDto {
 
    private String make;
    private int seatCount;
    private String type;
 
    //constructor, getters, setters etc.
}

@Mapper 1
public interface CarMapper {
 
    CarMapper INSTANCE = Mappers.getMapper( CarMapper.class ); 3
 
    @Mapping(source = "numberOfSeats", target = "seatCount")
    CarDto carToCarDto(Car car); 2
