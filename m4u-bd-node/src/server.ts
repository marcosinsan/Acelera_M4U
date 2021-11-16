import express, { request, response } from 'express';
import routes from './routes';
import "./database/migrations";

const app = express();

app.use(express.json());

app.use(routes);


// Método que recebe como param a porta e uma func callback
app.listen(3000, () => console.log("Servidor inicializando na porta 3000..."));