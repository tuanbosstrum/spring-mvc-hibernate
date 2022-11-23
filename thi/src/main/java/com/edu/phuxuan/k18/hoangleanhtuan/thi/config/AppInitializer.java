package com.edu.phuxuan.k18.hoangleanhtuan.thi.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.edu.phuxuan.k18.hoangleanhtuan.thi.config.PersistenceJPAConfig;
import com.edu.phuxuan.k18.hoangleanhtuan.thi.config.WebMvcConfig;

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