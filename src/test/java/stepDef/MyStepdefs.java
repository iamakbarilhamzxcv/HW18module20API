package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.ApiPage;

public class MyStepdefs {

    ApiPage apiPage;
    public MyStepdefs(){
        this.apiPage = new ApiPage();
    }


    @Given("prepare url valid for {string}")
    public void prepareUrlValidFor(String url) {
        apiPage.prepareUrlValidFor(url);
    }

    @And("hit api get list user")
    public void hitApiGetListUser() {
        apiPage.hitApiGetListUser();
    }

    @Then("validation status code is equals to {int}")
    public void validaationStatusCodeIsEqualsTo (int status_code){
        apiPage.validaationStatusCodeIsEqualsTo(status_code);
    }


    @Then("validation response body get list users")
    public void validationResponseBodyGetListUsers() {
        apiPage.validationResponseBodyGetListUsers();
    }

    @Then("validation response json with JSONSchema {string}")
    public void validationResponseJsonWithJSONSchema (String filename){
        apiPage.validationResponseJsonwithJSONSchema(filename);
    }

    @And("hit api post create new user")
    public void hitApiPostCreateNewUser() {
        apiPage.hitApiPostCreateUser();

    }

    @Then("validation response body post create new user")
    public void validationResponseBodyPostCreateNewUser() {
        apiPage.validationResponseBodyCreateUser();
    }

    @And("hit api delete new")
    public void hitApiDeleteNew() {
        apiPage.hitApiDeleteUser();
    }

    @And("hit api update data")
    public void hitApiUpdateData() {
        apiPage.hitApiUpdateUser();
    }

    @Then("validation response body update user")
    public void validationResponseBodyUpdateUser() {
        apiPage.validationResponseBodyUpdateUser();
    }
}
