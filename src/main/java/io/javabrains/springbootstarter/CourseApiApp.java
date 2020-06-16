package io.javabrains.springbootstarter;


import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;


@SpringBootApplication
@MapperScan
public class CourseApiApp {

	@Value("${spring.datasource.driverClassName}")
	private String datasourceDriverClassName;

	@Value("${spring.datasource.url}")
	private String datasourceUrl;

	@Value("${spring.datasource.username}")
	private String datasourceUsername;

	@Value("${spring.datasource.password}")
	private String datasourcePassword;

	@Bean("H2_DEMO")
	@Primary
	public DataSource getH2DemoDataSource() {
		DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
		dataSourceBuilder.driverClassName(datasourceDriverClassName);
		dataSourceBuilder.url(datasourceUrl);
		dataSourceBuilder.username(datasourceUsername);
		dataSourceBuilder.password(datasourcePassword);
		return dataSourceBuilder.build();
	}

	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception {
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setDataSource(getH2DemoDataSource());
		SqlSessionFactory factory = factoryBean.getObject();
		factory.getConfiguration().addMappers("io.javabrains.springbootstarter.mapper");
		return factoryBean.getObject();
	}


	public static void main(String[] args) {
		
		SpringApplication.run(CourseApiApp.class , args);
		
	}

}
