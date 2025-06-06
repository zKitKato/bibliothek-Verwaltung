package net.kato.bibliothekVerwaltungBackend.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;


@Configuration
@ComponentScan(basePackages = {"net.kato.bibliothekVerwaltungBackend.dto"})
@EnableTransactionManagement
public class HibernateConfig {

    private final static String DATABASE_URL = "jdbc:h2:tcp://localhost/~/BibliothekVerwaltung";
    private final static String DATABASE_DRIVER = "org.h2.Driver";
    private final static String DATABASE_DIALECT = "org.hibernate.dialect.H2Dialect";
    private final static String DATABASE_USERNAME = "sa";
    private final static String DATABASE_PASSWORD = "";

    //DataSource bean will be available
    @Bean
    public DataSource getDataSource() {

        BasicDataSource dataSource = new BasicDataSource();

        dataSource.setUrl(DATABASE_URL);
        dataSource.setDriverClassName(DATABASE_DRIVER);
        dataSource.setUsername(DATABASE_USERNAME);
        dataSource.setPassword(DATABASE_PASSWORD);

        return dataSource;
    }

    //SessionFactory bean will be available
    @Bean
    public SessionFactory getSessionFactory(DataSource dataSource) {
        LocalSessionFactoryBuilder builder = new LocalSessionFactoryBuilder(dataSource);

        builder.addProperties(getHibernateProperties());
        builder.scanPackages("net.kato.bibliothekVerwaltungBackend.dto");


        return builder.buildSessionFactory();
    }

    // All hibernate propertiss will be returned in this method
    private Properties getHibernateProperties() {
        Properties properties = new Properties();

        properties.put("hibernate.dialect", DATABASE_DIALECT);
        properties.put("hibernate.show_sql", "true");
        properties.put("hibernate.format_sql", "true");

        return properties;
    }

    @Bean
    public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
        HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
        return transactionManager;
    }

}
