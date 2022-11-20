package com.edu.phuxuan.cntt.k17.artist.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.edu.phuxuan.cntt.k17.artist.config.PersistenceJPAConfig;
import com.edu.phuxuan.cntt.k17.artist.config.WebMvcConfig;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	 
		@Override
		protected Class<?>[] getRootConfigClasses() {
			return new Class[] { PersistenceJPAConfig.class };
			//return null;
		}
	 
		@Override
		protected Class<?>[] getServletConfigClasses() {
			return new Class[] { WebMvcConfig.class };
		}
	 
		@Override
		protected String[] getServletMappings() {
			return new String[] { "/" };
		}
	 
	}