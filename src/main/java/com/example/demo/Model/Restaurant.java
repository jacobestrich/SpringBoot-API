package com.example.demo.Model;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Document("restaurants")

public class Restaurant 
{
    @Id
    public String id;

    public String borough;
    public String cuisine;
    public String name;

    public Restaurant(String id, String borough, String cuisine, String name) 
    {
        super();
        this.id = id;
        this.borough = borough;
        this.cuisine = cuisine;
        this.name = name;
    }
}
