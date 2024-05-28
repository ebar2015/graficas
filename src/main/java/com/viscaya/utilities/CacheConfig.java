/**
 * 
 */
package com.viscaya.utilities;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author joseviscaya
 *
 */
@Configuration
@EnableCaching
public class CacheConfig {
	
	@Bean
    public ConcurrentMapCacheManager dasboardMedicoCache() {
        return new ConcurrentMapCacheManager("dasboardMedicoCache");
    }

}
