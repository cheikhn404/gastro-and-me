package sn.atos.gastro_and_me.controllers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import sn.atos.gastro_and_me.GastroAndMeApplication;
import sn.atos.gastro_and_me.dto.RestaurantDTO;
import sn.atos.gastro_and_me.entities.enums.Speciality;
import sn.atos.gastro_and_me.services.RestaurantService;

import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@SpringBootTest(
        webEnvironment = SpringBootTest.WebEnvironment.MOCK,
        classes = GastroAndMeApplication.class)
@AutoConfigureMockMvc
public class RestaurantControllerTest {

    @Autowired
    private MockMvc mvc;

    @Autowired
    private RestaurantService restaurantService;


    @Test
    public void givenRestaurant_whenGetRestaurant_thenStatus200()
            throws Exception {

        createTestRestaurant("café Dior","3380000", "Cité keur",Speciality.LOCAL);

        mvc.perform(MockMvcRequestBuilders.get("/restaurants")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    private void createTestRestaurant(String name, String phoneNumber, String address, Speciality speciality) {
        RestaurantDTO restaurantDTO = new RestaurantDTO(null, name, phoneNumber,address,speciality);
        restaurantService.addRestaurant(restaurantDTO);
    }
}
