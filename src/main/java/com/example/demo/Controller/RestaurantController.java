package com.example.demo.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Model.Restaurant;
import com.example.demo.Repository.RestaurantRepository;

// localhost: 8080/api/restaurants

@RestController
@RequestMapping("/api/restaurants")
public class RestaurantController 
{
    @Autowired
    private RestaurantRepository restaurantRepository; 

    @GetMapping("/{borough}")
    public ResponseEntity<List<Restaurant>> FindRestaurantByBorough(@PathVariable(value = "borough") String borough)
    {
        List<Restaurant> restaurant = restaurantRepository.findByBorough(borough);

        if(restaurant != null)
        {
            return ResponseEntity.ok(restaurant);
        }
        else 
        {
            return ResponseEntity.notFound().build();
        }
    }
}
