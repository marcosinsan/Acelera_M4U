// Arquivo responsavel pela regras de de negocio da aplicação.

// Imports
import { Request, Response } from "express";
import { getCustomRepository } from "typeorm";

import {CadastroRepository} from "../repositories/CadastroRepository";

// Recurso de requisição
export default {

    async create(req: Request, res: Response) {
        const {nome, cpf} = req.body;
        var data = {cpf, nome};

        const repository = getCustomRepository(CadastroRepository);       

        data = await repository.save(data);
        
        return res.status(201).json({data:data});
    },

    async list(req: Request, res: Response){

        const result = null;

        return res.status(200).json({data:result});
    },

    async find(req: Request, res: Response){
        const { id } = req.params;
        const cadastro = null;
        return res.status(200).json(cadastro);
    },

    async update(req: Request, res: Response) {
        
        const { id } = req.params;
        const {nome, cpf} = req.body;

        const data = {cpf, nome};

        const cadastro = null;

        return res.status(200).json({data:cadastro});
    }, 

    async delete(req: Request, res: Response) {
        const { id } = req.params;

        
        return res.status(200).json({message: "Resgistro excluido com Sucesso!"})
    }
}