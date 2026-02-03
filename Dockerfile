# Imagen base actualizada
FROM eclipse-temurin:17-jdk-focal

# Carpeta de la app
WORKDIR /app

# Copiar jar generado por Maven
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar

# Exponer puerto
EXPOSE 8080

# Ejecutar la app
ENTRYPOINT ["java","-jar","/app/app.jar"]
