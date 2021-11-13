import express, { request, response } from 'express';

const app = express();

// Método que recebe como param a porta e uma func callback
app.listen(3000, () => console.log("Servidor inicializando na porta 3000..."));

// Método get
app.get("/", (request, response) => {
    return response.json({mensagem: "Bem-vindos ao gama - xp", ano:2021});
});