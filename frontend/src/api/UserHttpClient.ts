import { AddUserParameter } from "./Entities";
import { HttpClient } from "./HttpClient"

export class UserHttpClient extends HttpClient {

    constructor(){
        super(false)
    }

    public async isAccountExist(): Promise<boolean> {
        const response = await this.get("/user/isAccountExist")
        return response.data as boolean;
    }

    public async addUserAccount(parameter: AddUserParameter): Promise<boolean> {
        const response = await this.get("/user/addAccount", parameter)
        return response.data as boolean;
    }

}