package redisTest;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class MyRedis {

	public static void main(String[] args) {
		getConnection();
		
		
		
		
	}
	
	
	public static Jedis getConnection() {
		Jedis jedis = new Jedis("127.0.0.1", 6379);
		System.out.println("Connect Success " + jedis.ping());
		
		return jedis;
	}
	
	public static JedisPool getConnectionPool() {
		JedisPool pool = new JedisPool("127.0.0.1", 6379);
		
		
		return pool;
	}

}
