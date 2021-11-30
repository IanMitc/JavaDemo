"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
exports.__esModule = true;
exports.PartTimeEmployee = exports.FullTimeEmployee = exports.Employee = void 0;
var Test = /** @class */ (function () {
    function Test() {
    }
    Test.prototype.getName = function () {
        console.log('test');
    };
    return Test;
}());
exports["default"] = Test;
var Employee = /** @class */ (function () {
    function Employee() {
    }
    Employee.prototype.getFullName = function () {
        console.log("".concat(this.firstName, " ").concat(this.lastName));
    };
    return Employee;
}());
exports.Employee = Employee;
var FullTimeEmployee = /** @class */ (function (_super) {
    __extends(FullTimeEmployee, _super);
    function FullTimeEmployee() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    return FullTimeEmployee;
}(Employee));
exports.FullTimeEmployee = FullTimeEmployee;
var PartTimeEmployee = /** @class */ (function (_super) {
    __extends(PartTimeEmployee, _super);
    function PartTimeEmployee() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    return PartTimeEmployee;
}(Employee));
exports.PartTimeEmployee = PartTimeEmployee;
var fte = new FullTimeEmployee();
fte.firstName = 'Mark';
fte.lastName = 'Smith';
var pte = new PartTimeEmployee();
pte.firstName = 'Paul';
pte.lastName = 'Watson';
fte.getFullName();
pte.getFullName();
