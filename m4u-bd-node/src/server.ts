import express from 'express';

const app = express();

// Método que recebe como param a porta e uma func callback
app.listen(3000, () => console.log("Servidor inicializando na porta 3000..."));