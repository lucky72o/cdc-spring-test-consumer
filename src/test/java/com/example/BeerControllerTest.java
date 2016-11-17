package com.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureWebMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.cloud.contract.wiremock.AutoConfigureWireMock;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;
import static com.github.tomakehurst.wiremock.client.WireMock.get;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
@AutoConfigureJsonTesters
@AutoConfigureWireMock
public class BeerControllerTest {

    private ObjectMapper MAPPER = new ObjectMapper();

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldGiveMeABeer() throws Exception {
        
    }

    @Test
    public void shouldNotGiveMeABeer() throws Exception {
    }





//    @AutoConfigureStubRunner(ids = "com.example:cdc-test-producer:+:stubs:9090", workOffline = true)

//    @Test
//    public void shouldGiveMeABeer() throws Exception {
//
//        mockMvc.perform(MockMvcRequestBuilders.post("/beer")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content(MAPPER.writeValueAsString(new Person("slava", 18))))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.content().string("THERE YOU GO"));
//    }
//
//    @Test
//    public void shouldNotGiveMeABeer() throws Exception {
//        mockMvc.perform(MockMvcRequestBuilders.post("/beer")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content(MAPPER.writeValueAsString(new Person("slava", 17))))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.content().string("GET LOST"));
//    }

}