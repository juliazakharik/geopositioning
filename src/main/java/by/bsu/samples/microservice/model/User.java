package by.bsu.samples.microservice.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import java.util.*;

@Slf4j
@Data
@NoArgsConstructor
@Entity
@Table(name = "APP_USER")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class User implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "NAME", nullable = false)
  private String name;

  @Column(name = "PASSWORD", nullable = false)
  private String password;

  @Column(name = "ROLE", nullable = false)
  private String role;

  @Column(name = "ENABLE", nullable = false)
  private boolean enable;

  @Column(name = "latitude", nullable = false)
  private int latitude;

  @Column(name = "longitude", nullable = false)
  private int longitude;

  public void updateCoordinates(){
    List<Integer> coords = new ArrayList<Integer>();
    // update code
    saveCoordinatesDb(coords);
  }

  public List<Integer> getCoordinates(){
    List<Integer> coords = new ArrayList<Integer>();
    coords.add(this.latitude);
    coords.add(this.longitude);
    return coords;
  }

  public void saveCoordinatesDb(List<Integer> coordinates){
      // save to db code
  }
}
