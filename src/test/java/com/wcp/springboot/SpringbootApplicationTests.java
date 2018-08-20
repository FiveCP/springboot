package com.wcp.springboot;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {
	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	
	@Test
	public void save() {
		/*ArrayList<String> hs = new ArrayList<>();
		hs.add("2");hs.add("3");hs.add("7");
		String[] hs1 = (String[])hs.toArray(new String[hs.size()]);
		stringRedisTemplate.opsForValue().set("wcp", "FiveCP");
		stringRedisTemplate.opsForSet().add("CP",hs1);
		Assert.assertEquals(stringRedisTemplate.opsForValue().get("wcp"),"FiveCP");
		Assert.assertTrue(stringRedisTemplate.opsForSet().isMember("CP","2"));*/
	}
	
 


}
