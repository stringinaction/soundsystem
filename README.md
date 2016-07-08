# soundsystem
第二章样例

###自动扫描组件　@ComponentScan（指定包名）　@Component（可指定ID）
###自动装配    @Autowired 或@Inject
####1 当有且只有一个组件符合要求的话，Bean会被装配进来
####2 当没有组件符合要求时，可以设置@Autowired(required=false) Bean有可能会处于未装配状态，注意空指针
####3 当有多个Bean满足的话，会有异常

###通过ID获取Bean
