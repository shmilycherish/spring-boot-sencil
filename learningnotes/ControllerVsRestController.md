# @Controller VS @RestController

根据官方文档描述：

> Spring MVC provides an annotation-based programming model where @Controller and @RestController components use annotations to express request mappings, request input, exception handling, and more. 

>@RestController is a composed annotation that is itself meta-annotated with @Controller and @ResponseBody indicating a controller whose every method inherits the type-level @ResponseBody annotation and therefore writes directly to the response body vs view resolution and rendering with an HTML template.

也就是说使用@RestController 相当于自带@ResponseBody（仿佛就是马超，自带减一马），那么@ResponseBody干啥了咧；

## @ResponseBody

> 用于将Controller的方法返回的对象，通过实际的HttpMessageConverter转换为指定格式后，写入到Response对象的body数据区，

> 可以看到相关依赖包中默认提供的converter实现是基于jackson2的

> **什么时候使用**：返回的数据不是html标签的页面，而是其他某种格式的数据时（如json等）使用，可以根据实际需要自定义converter；


## @RestController

简化@Controller用法，适合于开发REST服务的时候使用

##@Controller

需要返回页面事配合视图解析器InternalResourceViewResolve使用，不怕麻烦配合@ResponseBody使用也行

## Question
使用ResponseEntity作为返回数据类型时，@Controller不需要配合@ResponseBody也可以成功返回，原因是什么

## example for @Controller and @ResponseBody
> 可以尝试移除@ResponseBody看看会发生什么


