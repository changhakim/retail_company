
var test1 = (()=>{
	return{
		main : ()=>{
		
		var food = new Food('cheese',100);
		alert(food.name+','+food.price+','+food.category);
		alert(new Product.name);
		
			
			
		}
	}
	
})();




var test =(()=>{
	let main = ()=>{
		let food = new Food('cheese',5);
		alert(food.category);
		alert(food.name);
	}
	return {main:main};
})();



function Product(name,price){
	this.name = name;
	this.price = price;
	
}
function Food(name,price){
	Product.call(this,name,price);
	this.category = 'food';
}






function People(name,age,gender,job){
	this.name = name;
	this.age = age;
	this.gender = gender;
	this.job = job;
}
//선언만 해줌 
People.prototype.setName = name=>{this.name = name;};
People.prototype.setAge = age=>{this.age = age;};
People.prototype.setGender = gender=>{this.gender = gender;};
People.prototype.setJob = job=>{this.job = job;};
People.prototype.getName =()=>{return this.name;};
People.prototype.getAge =()=>{return this.age;};
People.prototype.getGender =()=>{return this.gender;};
People.prototype.getJob =()=>{return this.job;};
//실행이되면 선언이 된게 만들어짐 스크립트는 프라이빗이라 접근자체가 되지않지만 프로토타입은 열려있다.

function Customer(grade,custNo){
	People.apply(this,arguments);
	this.grade = grade;
	this.custNo = custNo;
}
Customer.prototype = new People();
Customer.prototype.setName = name=>{
	//this.name='[닉네임]'+name 이건 자바문법
	Object.getPrototypeOf(Customer.prototype).setName('[닉네임]'+name);
	};
Customer.prototype.setGrade = grade=>{this.grade = grade;};
Customer.prototype.setCustNo = custNo=>{this.custNo = custNo;};
Customer.prototype.getGrade =()=>{return this.grade;};
Customer.prototype.getCustNo =()=>{return this.custNo;};

var test2 ={main:function(){
		let customer = new Customer();
		customer.setName('홍길동');
		customer.setAge('25세');
		customer.setGender('남');
		customer.setJob('개발자');
		customer.setGrade('3급');
		customer.setCustNo('123');
		alert('고객정보:'+customer.getName()+','
				+customer.getAge()+','
				+customer.getGender()+','
				+customer.getJob()+','
				+customer.getGrade()+','
				+customer.getCustNo())
	}};
	





var inherit = (()=>{
	return{
		main : ()=>{
	let emp1 = new Employee();		
	emp1.setSalary("100");
	emp1.setPosition("대리");
	alert("직급,급여:"+emp1.getSalary()+','+emp1.getPosition());
	},
	
	customer : ()=>{
	let cust1 = new Customer();
	cust1.setCustNo('1234');
	cust1.setGrade('실버등급');
	alert("고객번호,등급:"+cust1.getCustNo()+','+cust1.getGrade())
	}
	};
})();

function Employee(){
	let _salary, _position;

	return {setSalary:(salary)=>{this._salary=salary;},
			setPosition:(position)=>{this._position=position;},
			getSalary:()=>{return this._salary;},
			getPosition:()=>{return this._position;}
	};
};
//상속
function Customer1(){
	let _custNo, _grade;

	return {
		setCustNo:(custNo)=> {this._custNo=custNo;},
		setGrade :(grade)=> {this._grade=grade;},
		getCustNo:()=> {return this._custNo;},
		 getGrade:()=> {return this._grade;}
	};
};


//은닉
var app = (()=>{
	var main =()=>{
		person.setName('도널드 트럼프');
		person.setAge('73');
		person.setGender('남');
		person.setJob('미국 대통령');
		alert('스펙: '+person.toString());
	}
	return {main:main};
})();








var person = (()=>{
	var _name,_age,_gender,_job;
	var setName = (name)=>{this._name = name;}
	var setAge = (age)=>{this._age = age;}
	var setGender = (gender)=>{this._gender = gender;}
	var setJob = (job)=>{this._job = job;}
	var getName = ()=>{return this._name;}
	var getAge = ()=>{return this._age;}
	var getGender = ()=>{return this._gender;}
	var getJob = ()=>{return this._job;}
	var toString = ()=>{
		return this._name + ','+this._age + ','
			+this._gender + ','+this._job
	}
	return {setName:setName,
		setAge : setAge,
		setGender : setGender,
		setJob : setJob,
		getName : getName,
		getAge : getAge,
		getGender : getGender,
		getJob : getJob,
		toString : toString
	}
})();


