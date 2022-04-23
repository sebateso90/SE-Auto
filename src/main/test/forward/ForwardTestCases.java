package forward;

import static utils.TestCaseUtils.assertResults;
import static utils.TestCaseUtils.print;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;

import model.Arranque;
import model.Automovil;
import model.Bateria;
import model.Recomendacion;
import model.AccionRecomendada;
import model.Fuerza;
import model.Motor;
import model.TanqueCombustible;
import utils.KnowledgeSessionHelper;

public class ForwardTestCases {

	// Buscar archivo kmodule.xml. El nombre de la sesion debe ser igual al
	// configurado en ese archivo
	String K_SESSION_NAME = "kforward-chaining-session";

	KieSession sessionStatefull;
	static KieContainer kieContainer;

	FactHandle automovilDir;
	
	public ForwardTestCases() {
	}
		
	@BeforeClass
	public static void beforeallTestSetup() {
		kieContainer = KnowledgeSessionHelper.createRuleBase();
	}

	private void prepareKnowledgeSession() {
		sessionStatefull = KnowledgeSessionHelper.getStatefulKnowledgeSessionWithCallback(kieContainer, K_SESSION_NAME);
	}
	
	@Before
	public void setUp() {
		print("----------Start----------");
		print();
		this.prepareKnowledgeSession(); // Inicializa una nueva base de hechos
	}

	@After
	public void tearDown() {
		print();
		print("----------End----------");
		print();
	}

	@Test
	public void cargarBateriaTest() {
		
		print("Caso de prueba: Cargar Bateria");
		
		Motor motor = new Motor();
		motor.setArranque(Arranque.NoGira);

		Bateria bateria = new Bateria();
		bateria.setCargaPorcentual(1.0);

		TanqueCombustible tanque = new TanqueCombustible();
		tanque.setCargaLts(20.0);
		
		Automovil automovil = new Automovil(motor, bateria, tanque);
		
		print(automovil);
		sessionStatefull.insert(automovil);
		sessionStatefull.fireAllRules();

		Recomendacion recomendacion = automovil.getRecomendacion();
		AccionRecomendada valorEsperado = AccionRecomendada.CargarBateria;
		assertResults(recomendacion, valorEsperado);
	}

	@Test
	public void necesitaCombustibleTest() {
	
		print("Caso de prueba: Cargar Combustible");
		
		Motor motor = new Motor();
		motor.setArranque(Arranque.Gira);

		TanqueCombustible tanque = new TanqueCombustible();
		tanque.setCargaLts(0.0);

		Bateria bateria = new Bateria();
		bateria.setCargaPorcentual(70.0);
		
		Automovil automovil = new Automovil(motor, bateria, tanque);
		
		print(automovil);
		
		sessionStatefull.insert(automovil);
		sessionStatefull.fireAllRules();
		
		Recomendacion recomendacion = automovil.getRecomendacion();
		AccionRecomendada valorEsperado = AccionRecomendada.CargarCombustible;
		
		assertResults(recomendacion, valorEsperado);
	}

	
	  @Test public void limpiarTuberiasCombustibleTest() { 
		  
		  	print("Caso de prueba: Limpiar Tuberias de combustible");

			Motor motor = new Motor();
			motor.setArranque(Arranque.Gira);
			motor.setFuerza(Fuerza.Debil);
			
			Bateria bateria = new Bateria();
			bateria.setCargaPorcentual(80.0);
			
			TanqueCombustible tanque = new TanqueCombustible();
			tanque.setCargaLts(40.0);

			Automovil automovil = new Automovil(motor, bateria, tanque);

			print(automovil);
			
			sessionStatefull.insert(automovil);
			sessionStatefull.fireAllRules();
			
			Recomendacion recomendacion = automovil.getRecomendacion();
			
			AccionRecomendada valorEsperado = AccionRecomendada.LimpiarTuberiasCombustible;
			assertResults(recomendacion, valorEsperado);
		}
	 

	@Test
	public void ajustarPuntosDeInjeccionTest() {
	
		print("Caso de prueba: Ajustar Puntos de Injeccion");

		Motor motor = new Motor();
		motor.setArranque(Arranque.Gira);
		motor.setPresentaExplosiones(true);
	
		Bateria bateria = new Bateria();
		bateria.setCargaPorcentual(20.0);

		TanqueCombustible tanque = new TanqueCombustible();
		tanque.setCargaLts(40.0);

		Automovil automovil = new Automovil(motor,bateria,tanque);

		print(automovil);
		
		sessionStatefull.insert(automovil);
		sessionStatefull.fireAllRules();
		
		Recomendacion recomendacion = automovil.getRecomendacion();
		
		AccionRecomendada valorEsperado = AccionRecomendada.AjustarPuntosDeInyeccion;
		assertResults(recomendacion, valorEsperado);
	}

	@Test
	public void ajustarTimingMotorTest() {
		
		print("Caso de prueba: Ajustar Timing del Motor");

		Motor motor = new Motor();
		motor.setArranque(Arranque.Gira);
		motor.setPresentaGolpes(true);

		Bateria bateria = new Bateria();
		bateria.setCargaPorcentual(60.0);

		TanqueCombustible tanque = new TanqueCombustible();
		tanque.setCargaLts(60.0);

		Automovil automovil = new Automovil(motor,bateria,tanque);

		print(automovil);
		
		sessionStatefull.insert(automovil);
		sessionStatefull.fireAllRules();
		
		Recomendacion recomendacion = automovil.getRecomendacion();
		
		AccionRecomendada valorEsperado = AccionRecomendada.AjustarTimingMotor;
		
		assertResults(recomendacion, valorEsperado);
	}
}
