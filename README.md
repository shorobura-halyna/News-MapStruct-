
# MapStruct

### https://mapstruct.org/documentation/stable/reference/html/

### https://mapstruct.org/

Set up:
For Maven based projects add the following to your POM file in order to use MapStruct:

<h1 class="code-line" data-line-start=0 data-line-end=1 ><a id="MapStruct_0"></a>MapStruct</h1>
<p class="has-line-data" data-line-start="1" data-line-end="3">Set up:<br>
For Maven based projects add the following to your POM file in order to use MapStruct:</p>
<p class="has-line-data" data-line-start="4" data-line-end="36">&lt;properties&gt;<br>
&lt;org.mapstruct.version&gt;1.3.1.Final&lt;/org.mapstruct.version&gt;<br>
&lt;/properties&gt;<br>
…<br>
&lt;dependencies&gt;<br>
&lt;dependency&gt;<br>
&lt;groupId&gt;org.mapstruct&lt;/groupId&gt;<br>
&lt;artifactId&gt;mapstruct&lt;/artifactId&gt;<br>
&lt;version&gt;${org.mapstruct.version}&lt;/version&gt;<br>
&lt;/dependency&gt;<br>
&lt;/dependencies&gt;<br>
…<br>
&lt;build&gt;<br>
&lt;plugins&gt;<br>
&lt;plugin&gt;<br>
&lt;groupId&gt;org.apache.maven.plugins&lt;/groupId&gt;<br>
&lt;artifactId&gt;maven-compiler-plugin&lt;/artifactId&gt;<br>
&lt;version&gt;3.5.1&lt;/version&gt;<br>
&lt;configuration&gt;<br>
&lt;source&gt;1.8&lt;/source&gt;<br>
&lt;target&gt;1.8&lt;/target&gt;<br>
&lt;annotationProcessorPaths&gt;<br>
&lt;path&gt;<br>
&lt;groupId&gt;org.mapstruct&lt;/groupId&gt;<br>
&lt;artifactId&gt;mapstruct-processor&lt;/artifactId&gt;<br>
&lt;version&gt;${org.mapstruct.version}&lt;/version&gt;<br>
&lt;/path&gt;<br>
&lt;/annotationProcessorPaths&gt;<br>
&lt;/configuration&gt;<br>
&lt;/plugin&gt;<br>
&lt;/plugins&gt;<br>
&lt;/build&gt;</p>


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
    
    

    @Mapper 
    public interface CarMapper 
        CarMapper INSTANCE = Mappers.getMapper( CarMapper.class ); 
        
    @Mapping(source = "numberOfSeats", target = "seatCount")
    CarDto carToCarDto(Car car); 
