// Arquivo responsavel pela regras de de negocio da aplicação.

// Imports
import { Request, Response } from "express";
import { getCustomRepository } from "typeorm";

import {CadastroRepository} from "../repositories/CadastroRepository";

// Recurso de requisição
export default {

    // Crinado cadastro

    async create(req: Request, res: Response) {
        const {nome, cpf} = req.body;
        var data = {cpf, nome};

        const repository = getCustomRepository(CadastroRepository);       

        data = await repository.save(data);
        
        return res.status(201).json({data:data});
    },

    // Criando lista de cadastros

    async list(req: Request, res: Response){

        const repository = getCustomRepository(CadastroRepository);
        const data = await repository.find();

        return res.status(200).json({data:data});
    },

    // Busca cadastro por id
    async find(req: Request, res: Response){
        const { id } = req.params;
        const repository = getCustomRepository(CadastroRepository);
        const cadastro = await repository.findOne(id);

        return res.status(200).json(cadastro);
    },

    // Atualização de cadastros

    async update(req: Request, res: Response) {
        const { id } = req.params;
        const {nome, cpf} = req.body;

        const data = {cpf, nome};

        const repository = getCustomRepository(CadastroRepository);
        await repository.update(id, data);

        return res.status(200).json({data:"Cadastros realizado com sucesso!"});
    }, 

    async delete(req: Request, res: Response) {
        const { id } = req.params;

        const repository = getCustomRepository(CadastroRepository);
        await repository.delete(id);
        
        return res.status(200).json({message: "Resgistro excluido com Sucesso!"})
    }
}