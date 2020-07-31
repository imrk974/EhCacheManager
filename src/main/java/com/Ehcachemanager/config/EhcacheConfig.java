package com.Ehcachemanager.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;


@EnableCaching
@Configuration
public class EhcacheConfig {
	
	@Bean
	public CacheManager cacheManager() {
		return new EhCacheCacheManager(cacheManagefactory().getObject());
	}

	@Bean
	public EhCacheManagerFactoryBean cacheManagefactory() {
		EhCacheManagerFactoryBean bean = new EhCacheManagerFactoryBean();
		bean.setConfigLocation(new ClassPathResource("ehcache.xml"));
        bean.setShared(true);
        
		return bean;
	}

}
