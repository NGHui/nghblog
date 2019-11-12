package com.hui.blog.config;

import com.hui.blog.component.LoginHandlerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author 辉
 * 座右铭:坚持总能遇见更好的自己!
 * @date 2019/11/11
 */
@Configuration
public class HuiConfig implements WebMvcConfigurer {

    @Bean
    public WebMvcConfigurer webMvcConfigurer() {
        WebMvcConfigurer configurer = new WebMvcConfigurer() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                //页面跳转控制器
                registry.addViewController("/admin").setViewName("admin/login");
                registry.addViewController("/admin/index").setViewName("admin/index");
                registry.addViewController("/admin/blogs").setViewName("admin/blogs");
                registry.addViewController("/admin/types").setViewName("admin/types");
                registry.addViewController("/admin/tags").setViewName("admin/tags");
                registry.addViewController("/admin/tags/input").setViewName("admin/tags-input");
                //防止表单提交,要使用页面跳转
                //registry.addViewController("/main.html").setViewName("index");

            }
            //注册拦截器
            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                //super.addInterceptors(registry);
                //静态资源；  *.css , *.js
                //SpringBoot已经做好了静态资源映射
                //SpringBoot2.0以上拦截器不会对静态资源默认放行
                registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
                        .excludePathPatterns("/","/admin","/admin/tologin","/css/**","/images/**","/js/**","/layer/**","/lib/**");
            }
        };
        return configurer;
    }

}
