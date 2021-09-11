package com.example.demo.controllers;
import static org.assertj.core.api.Assertions.assertThat;

import com.example.demo.services.BreedService;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.containsStringIgnoringCase;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;


//
//@SpringBootTest
//public class BreedControllerTest {
//
//    @Autowired
//    private BreedController controller;
//
//    @Test
//    public void contextLoads() throws Exception {
//        assertThat(controller).isNotNull();
//    }
//}

@WebMvcTest
public class BreedControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private BreedService breedService;

    @Test
    public void shouldReturnDefaultMessage() throws Exception {
        //String expectedJSONData = breedService.list().getMessage();
//        String expectedJSONData = "{\"message\":" + breedService.list().getMessage() + ",\"status\":\"success\"}";
        String expected = "{\"message\":\"{  \\\"wolfhound\\\": [    \\\"irish\\\"  ],  \\\"whippet\\\": [],  \\\"weimaraner\\\": [],  \\\"waterdog\\\": [    \\\"spanish\\\"  ],  \\\"vizsla\\\": [],  \\\"terrier\\\": [    \\\"american\\\",    \\\"australian\\\",    \\\"bedlington\\\",    \\\"border\\\",    \\\"dandie\\\",    \\\"fox\\\",    \\\"irish\\\",    \\\"kerryblue\\\",    \\\"lakeland\\\",    \\\"norfolk\\\",    \\\"norwich\\\",    \\\"patterdale\\\",    \\\"russell\\\",    \\\"scottish\\\",    \\\"sealyham\\\",    \\\"silky\\\",    \\\"tibetan\\\",    \\\"toy\\\",    \\\"westhighland\\\",    \\\"wheaten\\\",    \\\"yorkshire\\\"  ],  \\\"stbernard\\\": [],  \\\"springer\\\": [    \\\"english\\\"  ],  \\\"spaniel\\\": [    \\\"blenheim\\\",    \\\"brittany\\\",    \\\"cocker\\\",    \\\"irish\\\",    \\\"japanese\\\",    \\\"sussex\\\",    \\\"welsh\\\"  ],  \\\"shihtzu\\\": [],  \\\"shiba\\\": [],  \\\"sheepdog\\\": [    \\\"english\\\",    \\\"shetland\\\"  ],  \\\"setter\\\": [    \\\"english\\\",    \\\"gordon\\\",    \\\"irish\\\"  ],  \\\"schnauzer\\\": [    \\\"giant\\\",    \\\"miniature\\\"  ],  \\\"schipperke\\\": [],  \\\"samoyed\\\": [],  \\\"saluki\\\": [],  \\\"rottweiler\\\": [],  \\\"ridgeback\\\": [    \\\"rhodesian\\\"  ],  \\\"retriever\\\": [    \\\"chesapeake\\\",    \\\"curly\\\",    \\\"flatcoated\\\",    \\\"golden\\\"  ],  \\\"redbone\\\": [],  \\\"pyrenees\\\": [],  \\\"puggle\\\": [],  \\\"pug\\\": [],  \\\"poodle\\\": [    \\\"miniature\\\",    \\\"standard\\\",    \\\"toy\\\"  ],  \\\"pomeranian\\\": [],  \\\"pointer\\\": [    \\\"german\\\",    \\\"germanlonghair\\\"  ],  \\\"pitbull\\\": [],  \\\"pinscher\\\": [    \\\"miniature\\\"  ],  \\\"pembroke\\\": [],  \\\"pekinese\\\": [],  \\\"dhole\\\": [],  \\\"deerhound\\\": [    \\\"scottish\\\"  ],  \\\"dane\\\": [    \\\"great\\\"  ],  \\\"dalmatian\\\": [],  \\\"dachshund\\\": [],  \\\"cotondetulear\\\": [],  \\\"corgi\\\": [    \\\"cardigan\\\"  ],  \\\"coonhound\\\": [],  \\\"collie\\\": [    \\\"border\\\"  ],  \\\"cockapoo\\\": [],  \\\"clumber\\\": [],  \\\"chow\\\": [],  \\\"chihuahua\\\": [],  \\\"cattledog\\\": [    \\\"australian\\\"  ],  \\\"cairn\\\": [],  \\\"bullterrier\\\": [    \\\"staffordshire\\\"  ],  \\\"beagle\\\": [],  \\\"basenji\\\": [],  \\\"australian\\\": [    \\\"shepherd\\\"  ],  \\\"appenzeller\\\": [],  \\\"akita\\\": [],  \\\"airedale\\\": [],  \\\"african\\\": [],  \\\"affenpinscher\\\": [],  \\\"bluetick\\\": [],  \\\"borzoi\\\": [],  \\\"bouvier\\\": [],  \\\"boxer\\\": [],  \\\"brabancon\\\": [],  \\\"briard\\\": [],  \\\"buhund\\\": [    \\\"norwegian\\\"  ],  \\\"bulldog\\\": [    \\\"boston\\\",    \\\"english\\\",    \\\"french\\\"  ],  \\\"dingo\\\": [],  \\\"doberman\\\": [],  \\\"elkhound\\\": [    \\\"norwegian\\\"  ],  \\\"entlebucher\\\": [],  \\\"eskimo\\\": [],  \\\"finnish\\\": [    \\\"lapphund\\\"  ],  \\\"frise\\\": [    \\\"bichon\\\"  ],  \\\"germanshepherd\\\": [],  \\\"greyhound\\\": [    \\\"italian\\\"  ],  \\\"groenendael\\\": [],  \\\"havanese\\\": [],  \\\"hound\\\": [    \\\"afghan\\\",    \\\"basset\\\",    \\\"blood\\\",    \\\"english\\\",    \\\"ibizan\\\",    \\\"plott\\\",    \\\"walker\\\"  ],  \\\"husky\\\": [],  \\\"keeshond\\\": [],  \\\"kelpie\\\": [],  \\\"komondor\\\": [],  \\\"kuvasz\\\": [],  \\\"labradoodle\\\": [],  \\\"labrador\\\": [],  \\\"leonberg\\\": [],  \\\"lhasa\\\": [],  \\\"malamute\\\": [],  \\\"malinois\\\": [],  \\\"maltese\\\": [],  \\\"mastiff\\\": [    \\\"bull\\\",    \\\"english\\\",    \\\"tibetan\\\"  ],  \\\"mexicanhairless\\\": [],  \\\"mix\\\": [],  \\\"mountain\\\": [    \\\"bernese\\\",    \\\"swiss\\\"  ],  \\\"newfoundland\\\": [],  \\\"otterhound\\\": [],  \\\"ovcharka\\\": [    \\\"caucasian\\\"  ],  \\\"papillon\\\": []}\",\"status\":\"success\"}";
        this.mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string( expected ));
    }

//    @Test
//    public void shouldReturnDefaultMessage() throws Exception {
//        String expectedJSONData = "{\"message\":\"{  " + breedService.list().getMessage() + ",\"status\":\"success\"}";
//        this.mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk())
//                .andExpect(content().json(expectedJSONData));
//    }
}