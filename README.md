# springboot-upload

## Version
Spring boot v3.0.2

---
這是一個透過Springboot 依賴關係進行的簡易的檔案上傳功能

---
## Controller.java

因Spring boot版本的差異 v2.xx以上將
`@RequestMapping("/uploadAttach")` 改用 `@PostMapping("/uploadAttach")` 取代
否則在執行的時候會出現以下錯誤訊息 Request method 'POST' is not supported


## application.properties
Spring boot2.0之後系統默認單次上傳請求大小限制1MB、單次請求總數大小為10MB

v1.0後寫法
<pre>
spring.http.multipart.maxFileSize = 100MB
spring.http.multipart.maxRequestSize=200MB
</pre>

v2.0後寫法
<pre>spring.servlet.multipart.max-file-size=100MB
spring.servlet.multipart.max-request-size=200MB</pre>
