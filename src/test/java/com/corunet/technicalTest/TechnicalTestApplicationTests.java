package com.corunet.technicalTest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.CoreMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class TechnicalTestApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void requiredTest1() throws Exception {
		this.mockMvc.perform(get("/price/findByCriteria")
						.param("productId", "35455")
						.param("brandId", "1")
						.param("applicationDate", "2020-06-14 10:00:00")
				).andDo(print()).andExpect(status().isOk())
				.andExpect(jsonPath("$", notNullValue()))
				.andExpect(jsonPath("$.productId", is(35455)))
				.andExpect(jsonPath("$.brandId", is(1)))
				.andExpect(jsonPath("$.priceRateDescription", is("Price Rate 1")))
				.andExpect(jsonPath("$.startDate[0]", is(2020)))
				.andExpect(jsonPath("$.startDate[1]", is(6)))
				.andExpect(jsonPath("$.startDate[2]", is(14)))
				.andExpect(jsonPath("$.startDate[3]", is(0)))
				.andExpect(jsonPath("$.startDate[4]", is(0)))
				.andExpect(jsonPath("$.endDate[0]", is(2020)))
				.andExpect(jsonPath("$.endDate[1]", is(12)))
				.andExpect(jsonPath("$.endDate[2]", is(31)))
				.andExpect(jsonPath("$.endDate[3]", is(23)))
				.andExpect(jsonPath("$.endDate[4]", is(59)))
				.andExpect(jsonPath("$.endDate[5]", is(59)))
				.andExpect(jsonPath("$.price", is(35.50)));
	}

	@Test
	public void requiredTest2() throws Exception {
		this.mockMvc.perform(get("/price/findByCriteria")
						.param("productId", "35455")
						.param("brandId", "1")
						.param("applicationDate", "2020-06-14 16:00:00")
				).andDo(print()).andExpect(status().isOk())
				.andExpect(jsonPath("$", notNullValue()))
				.andExpect(jsonPath("$.productId", is(35455)))
				.andExpect(jsonPath("$.brandId", is(1)))
				.andExpect(jsonPath("$.priceRateDescription", is("Price Rate 2")))
				.andExpect(jsonPath("$.startDate[0]", is(2020)))
				.andExpect(jsonPath("$.startDate[1]", is(6)))
				.andExpect(jsonPath("$.startDate[2]", is(14)))
				.andExpect(jsonPath("$.startDate[3]", is(15)))
				.andExpect(jsonPath("$.startDate[4]", is(0)))
				.andExpect(jsonPath("$.endDate[0]", is(2020)))
				.andExpect(jsonPath("$.endDate[1]", is(06)))
				.andExpect(jsonPath("$.endDate[2]", is(14)))
				.andExpect(jsonPath("$.endDate[3]", is(18)))
				.andExpect(jsonPath("$.endDate[4]", is(30)))
				.andExpect(jsonPath("$.price", is(25.45)));
	}

	@Test
	public void requiredTest3() throws Exception {
		this.mockMvc.perform(get("/price/findByCriteria")
						.param("productId", "35455")
						.param("brandId", "1")
						.param("applicationDate", "2020-06-14 21:00:00")
				).andDo(print()).andExpect(status().isOk())
				.andExpect(jsonPath("$", notNullValue()))
				.andExpect(jsonPath("$.productId", is(35455)))
				.andExpect(jsonPath("$.brandId", is(1)))
				.andExpect(jsonPath("$.priceRateDescription", is("Price Rate 1")))
				.andExpect(jsonPath("$.startDate[0]", is(2020)))
				.andExpect(jsonPath("$.startDate[1]", is(6)))
				.andExpect(jsonPath("$.startDate[2]", is(14)))
				.andExpect(jsonPath("$.startDate[3]", is(0)))
				.andExpect(jsonPath("$.startDate[4]", is(0)))
				.andExpect(jsonPath("$.endDate[0]", is(2020)))
				.andExpect(jsonPath("$.endDate[1]", is(12)))
				.andExpect(jsonPath("$.endDate[2]", is(31)))
				.andExpect(jsonPath("$.endDate[3]", is(23)))
				.andExpect(jsonPath("$.endDate[4]", is(59)))
				.andExpect(jsonPath("$.endDate[5]", is(59)))
				.andExpect(jsonPath("$.price", is(35.50)));
	}

	@Test
	public void requiredTest4() throws Exception {
		this.mockMvc.perform(get("/price/findByCriteria")
						.param("productId", "35455")
						.param("brandId", "1")
						.param("applicationDate", "2020-06-15 10:00:00")
				).andDo(print()).andExpect(status().isOk())
				.andExpect(jsonPath("$", notNullValue()))
				.andExpect(jsonPath("$.productId", is(35455)))
				.andExpect(jsonPath("$.brandId", is(1)))
				.andExpect(jsonPath("$.priceRateDescription", is("Price Rate 3")))
				.andExpect(jsonPath("$.startDate[0]", is(2020)))
				.andExpect(jsonPath("$.startDate[1]", is(6)))
				.andExpect(jsonPath("$.startDate[2]", is(15)))
				.andExpect(jsonPath("$.startDate[3]", is(0)))
				.andExpect(jsonPath("$.startDate[4]", is(0)))
				.andExpect(jsonPath("$.endDate[0]", is(2020)))
				.andExpect(jsonPath("$.endDate[1]", is(6)))
				.andExpect(jsonPath("$.endDate[2]", is(15)))
				.andExpect(jsonPath("$.endDate[3]", is(11)))
				.andExpect(jsonPath("$.endDate[4]", is(00)))
				.andExpect(jsonPath("$.price", is(30.50)));
	}

	@Test
	public void requiredTest5() throws Exception {
		this.mockMvc.perform(get("/price/findByCriteria")
						.param("productId", "35455")
						.param("brandId", "1")
						.param("applicationDate", "2020-06-16 21:00:00")
				).andDo(print()).andExpect(status().isOk())
				.andExpect(jsonPath("$", notNullValue()))
				.andExpect(jsonPath("$.productId", is(35455)))
				.andExpect(jsonPath("$.brandId", is(1)))
				.andExpect(jsonPath("$.priceRateDescription", is("Price Rate 4")))
				.andExpect(jsonPath("$.startDate[0]", is(2020)))
				.andExpect(jsonPath("$.startDate[1]", is(6)))
				.andExpect(jsonPath("$.startDate[2]", is(15)))
				.andExpect(jsonPath("$.startDate[3]", is(16)))
				.andExpect(jsonPath("$.startDate[4]", is(0)))
				.andExpect(jsonPath("$.endDate[0]", is(2020)))
				.andExpect(jsonPath("$.endDate[1]", is(12)))
				.andExpect(jsonPath("$.endDate[2]", is(31)))
				.andExpect(jsonPath("$.endDate[3]", is(23)))
				.andExpect(jsonPath("$.endDate[4]", is(59)))
				.andExpect(jsonPath("$.endDate[5]", is(59)))
				.andExpect(jsonPath("$.price", is(38.95)));
	}


}
