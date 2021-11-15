import {MigrationInterface, QueryRunner, Table} from "typeorm";

export class CreateTabCadastro1636992887756 implements MigrationInterface {

    public async up(queryRunner: QueryRunner): Promise<void> {
        await queryRunner.createTable(
            new Table({
                name: "tab_cadastro",
                columns: [
                    {name: "id", type: "integer", isPrimary: true, isGenerated: true, generationStrategy: "increment"},
                    {name: "cpf", type: "varchar", length: "15"},
                    {name: "nome", type: "varchar", length: "50"}
                ]
            })
        )
        
    }

    public async down(queryRunner: QueryRunner): Promise<void> {
        await queryRunner.dropTable("tab_cadastro");
    }


}
