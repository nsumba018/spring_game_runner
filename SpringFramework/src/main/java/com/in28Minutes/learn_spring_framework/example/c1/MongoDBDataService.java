package com.in28Minutes.learn_spring_framework.example.c1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDBDataService  implements DataService {

    @Override
    public int[] retrieveData() {
        return new int[] {12,57,71,19,35,23};
    }
}
