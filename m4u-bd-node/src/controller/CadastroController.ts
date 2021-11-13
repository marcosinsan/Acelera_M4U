// Arquivo responsavel pela regras de de negocio da aplicação.

// Imports
import { Request, Response } from "express";

// Recurso de requisição
export default {
    async create(req: Request, res: Response) {
        const {nome, cpf} = req.body;
        const id = 999;
        const data = {id, nome, cpf};
        return res.status(201).json({data:data});
    },
    async list(req: Request, res: Response){
        var result = [{id: 2, cpf:"123456789", nome: "Fulano de Tal"}, {id:1, cpf: "987654321", nome: "Ciclano de TAl"}];
        return res.status(200).json({data:result});
    },
    async update(req: Request, res: Response) {
        const {nome, cpf} = req.body;
        const dataAlteracao = '13/11/2021 12:50';
        const cadastro = {nome, cpf, dataAlteracao};
        cadastro.nome = "João do pé de feijão";
        return res.status(200).json({data:cadastro});
    }
}